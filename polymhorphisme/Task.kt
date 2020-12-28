package polymhorphisme


fun main(){
    val bayu = Dosen()
    bayu.nama = "Bayu"
    bayu.alamat="condongcatur"
    bayu.perkenalan()
    bayu.gaji = 1000000
    bayu.bekerja()
    bayu.prodi="sistem informasi"
    bayu.mengajar()
    println()

    val wira = Mahasiswa()
    wira.nama="wira"
    wira.alamat="concat"
    wira.perkenalan()
    wira.prodi="SI"
    wira.belajar()
    println()

    val dwi= Satpam()
    dwi.nama="dwi"
    dwi.alamat="concat"
    dwi.perkenalan()
    dwi.gaji = 500000
    dwi.bekerja()
    dwi.pos=" barat"
    dwi.menjaga()
    println()

    val anjing = anjing()
    anjing.jenis = "Mamalia"
    anjing.nama ="Anjing"
    anjing.usia =2
    anjing.hewan()
    anjing.suka ="Tulang"
    anjing.suka()
    println()

    val bebek = bebek()
    bebek.jenis=" unggas"
    bebek.nama ="bebek"
    bebek.usia =1
    bebek.hewan()
    bebek.kaki=2
    bebek.tubuh="panjang"
    bebek.body()
    println()

    val ikan = ikan()
    ikan.nama="hias"
    ikan.jenis="ikan "
    ikan.usia = 1
    ikan.hewan()
    ikan.makan="lumut"
    ikan.makan()
    println()

    val sedan = sedan()
    sedan.jenis= "Mobil"
    sedan.merk ="BMW"
    sedan.warna="white"
    sedan.kendaraan()
    sedan.roda=4
    sedan.mobiljenis="Sedan"
    sedan.mobil()
    sedan.sedan()
    println()

    val truk = truk()
    truk.jenis= "Mobil"
    truk.merk ="Yamaha"
    truk.warna="yellow"
    truk.kendaraan()
    truk.roda=8
    truk.mobiljenis="Truk"
    truk.mobil()
    truk.truk()
    println()

    val matic= matic()
    matic.jenis="Motor"
    matic.merk="honda"
    matic.warna="blue"
    matic.kendaraan()
    matic.penumpang=2
    matic.jenismotor="Matic"
    matic.motor()
    matic.brand="Beat"
    matic.matic()
    println()

    val kopling= kopling()
    kopling.jenis="Motor"
    kopling.merk="Yamaha"
    kopling.warna="black"
    kopling.kendaraan()
    kopling.penumpang=2
    kopling.jenismotor="Kopling"
    kopling.motor()
    kopling.kopling()
    println()




}