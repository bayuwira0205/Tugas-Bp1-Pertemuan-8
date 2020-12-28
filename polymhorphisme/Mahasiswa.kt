package polymhorphisme
class Mahasiswa: Orang(){
    var prodi : String=""

    fun belajar(){
        println("saya belajar di Prodi $prodi")
    }
    override fun perkenalan() {
        println("hi guys kenalin, aku $nama aku tinggal di $alamat")
    }
}