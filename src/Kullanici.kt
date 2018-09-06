class Kullanici {

    var isim : String = "Ali"
    var yas : Int = 27

    fun dogduguYil() = 2018 - yas

}

fun main(args: Array<String>) {
    var kullanici : Kullanici = Kullanici()
    println(kullanici.isim)
    println(kullanici.yas)
    println(kullanici.dogduguYil())
}