import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

suspend fun main() {
    val client = HttpClient(CIO)
    val response: HttpResponse = client.get("https://apppolicial.es/php/consulta_cp.php")
    println(response.bodyAsText())
    client.close()
}