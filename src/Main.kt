fun main() {
    val song = Song("Wan Pigs", "John Denver", 1968, 1100)
    song.printDescription()

}

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int){
    val isPopular : Boolean
        get() = playCount >= 1000

    fun printDescription(){
        println("$title, performed by $artist, was released in $yearPublished years published.")
    }

}