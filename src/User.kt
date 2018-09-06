open class GeometrikSekil(){
    var en : Int = 5
    var boy : Int = 4

    open fun alanHesapla(){
        println("Alan : "+ (en*boy))
    }

    override fun toString(): String {
        return super.toString()
    }
}


class Kare : GeometrikSekil(){
    override fun alanHesapla() {
       super.alanHesapla()
        println("Alan : " + 2*2)
    }
}

fun main(args: Array<String>) {
    var kare : Kare = Kare()
    kare.alanHesapla()

}