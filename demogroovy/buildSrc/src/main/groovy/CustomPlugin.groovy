import org.gradle.api.*

class MessageHolder{
    String message
}
class GreetingPlugin implements Plugin<Project> {
    void apply(Project project) {
        def extension = project.extensions.create("greeting", MessageHolder)
        project.task('hello') {
            println("Greetings!")
            doLast {
                println extension.message
            }
        }
    }
}