class Ogrenci (var isim : String, var yas : Int){

    init {
        isim = isim.trim().toUpperCase()
        yas = yas--
    }
    fun bilgileriGoster(){
        println("isim : $isim, yas : $yas")
    }
}

fun main(args: Array<String>) {
    var ogr1 : Ogrenci = Ogrenci("Ali",25)
    ogr1.bilgileriGoster()
}