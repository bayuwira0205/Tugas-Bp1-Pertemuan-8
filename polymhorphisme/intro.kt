package polymhorphisme

open class intro {
    var nama:String=""
    var jenis: String=""
    var usia : Int=0
    open fun hewan(){
        println("aku adalah $jenis, namaku $nama dan aku berusia $usia tahun")
    }
}