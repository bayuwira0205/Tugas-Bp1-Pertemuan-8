package inheritance

class Mahasiswa: Orang(){
    var nip:String=""
    var prodi : String=""

    fun belajar(){
        println("saya belajar di Prodi $prodi")
    }
}