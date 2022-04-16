
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class TodoItem(val name:String, val value:String) {

    @Id
    var id = ""

}
