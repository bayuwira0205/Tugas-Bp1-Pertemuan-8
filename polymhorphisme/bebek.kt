package polymhorphisme

class bebek : intro () {
    var kaki: Int =0
    var tubuh : String =""

    fun body(){
        println("$nama itu mempunyai $kaki kaki dan leher yang $tubuh")
    }
    override fun hewan() {
        println("itu merupakan $jenis, nama dari $jenis tersebut adalah $nama dan usianya baru $usia tahun")
    }
}