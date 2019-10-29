package com.meongdroid.aplikasipahlawanislamindonesia

object HeroesData {
    private val namaPahlawan = arrayOf("Pangeran Diponegoro","Tuanku Imam Bonjol","Cut Nyak Dien","KH. Hasyim Asy'ari","KH. Ahmad Dahlan","Haji Agus Salim")
    private val asalPahlawan = arrayOf("dari kesultanan Mataram, Yogyakarta","dari Pasaman, Sumatra Barat","dari Meulaboh Aceh","dari Jombang, Jawa Timur","dari Yogyakarta","dari Agam, Sumatera Barat")
    private val biografi = arrayOf("Pangeran Diponegoro adalah anak sulung dari sultan Hamengkubuwana III yang lahir pada 11 November 1785, dengan nama asli Raden Mas Antarwirya. Beliau adalah pemimpin perang Jawa yang tercatat memakan korban paling banyak di Indonesia. Dengan taktik perang Gerilya yang terkenal dan ditakuti oleh Belanda. Belanda kewalahan dalam melawan taktik Pangeran Diponegoro yang keluar masuk hutan dan muncul dimalam hari untuk melakukan serangan secara tiba-tiba.",
        "Tuanku Imam Bonjol yang memiliki nama asli Muhammad Shahab merupakan seorang ulama Minangkabau kelahiran Bonjol, Sumatera Barat. Ia lah sang imam Kaum Paderi di tanah kelahirannya. Beliau juga merupakan putra dari ulama ternama asal Sungai Rimbang, Suliki, Khatib Bayanuddin.",
        "Cut Nyak Dien adalah Pahlawan Nasional wanita Indonesia yang berasal dari Aceh. Cut Nyak Dien lahir pada tahun 1848 dari keluarga bangsawan yang agamis di Aceh Besar. Dari garis ayahnya, Cut Nyak Dien merupakan keturunan langsung Sultan Aceh.\n"
                + "Ketika usianya menginjak 12 tahun, Cut Nyak Dien dinikahkan dengan Teuku Cek Ibrahim Lamnga pada tahun 1862 yang juga berasal dari keluarga bangsawan. Pasangan muda ini dikaruniai satu orang anak. Semangat Cut Njak Dien untuk melawan pasukan kolonial Belanda mulai bangkit. Peristiwa gugurnya Teuku Cek Ibrahim Lamnga dalam peperangan melawan Belanda pada tanggal 29 Juni 1878 di Sela Glee Tarun semakin menyulut kemarahan dan keteguhan wanita pemberani ini terhadap kaum Kolonial tersebut.",
        "Hadratus Syeikh KH Hasyim Asyari. Beliau adalah pendiri dari Nahdatul Ulama (NU) yang ditetapkan sebagai pahlawan nasional pada tanggal 17 November 1964 berkat jasanya yang berperan besar melawan penjajah dari Surabaya. Beliau dikenal dengan resolusi jihadnya pada tanggal 22 Oktober 1945. Selain menjadi pendiri NU, KH Hasyim Asyari juga mendirikan pondok pesantren Tebu Ireng, Jombang pada tahun 1899.",
        "KH Ahmad Dahlan. Kyai yang lahir di Yogyakarta ini sangat berjasa dalam membangkitkan semangat umat islam dalam menyadari statusnya sebagai bangsa yang terjajah. Dengan gagasan Muhammadiyahnya tersebut, kyai yang juga dikenal dengan Muhammad Darwisy ini ditetapkan sebagai pahlawan Nasional pada tahun 1961.",
        "Haji Agus Salim lahir dengan nama asli Mashudul Haq yang berarti “pembela kebenaran”. Ia Lahir di Kota Gadang, Agam, Sumatera Barat, Hindia Belanda, 8 Oktober 1884.")

    private val fotoPahlawan = arrayOf("https://www.ayoksinau.com/wp-content/uploads/2017/08/Sejarah-Pangeran-Diponegoro-e1502682493596.jpg",
        "https://live.staticflickr.com/295/20292682860_21c0702281_b.jpg",
        "https://2.bp.blogspot.com/-m_b-p7B4W-w/V-KPP9ue3FI/AAAAAAAAASc/8z5RUZa698EV9r_vn67Rs62C6WYUXaW7gCLcB/s1600/Cut%2BNyak%2BDhien.jpg",
        "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/69e0fa6f-af9d-44ab-89b2-6a8fc4fa6792/db8epbz-854b807e-e16c-450f-9dc1-8862c171e965.png/v1/fill/w_1024,h_1390,q_80,strp/kh__hasyim_asy_ari_by_ngartventure_db8epbz-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTM5MCIsInBhdGgiOiJcL2ZcLzY5ZTBmYTZmLWFmOWQtNDRhYi04OWIyLTZhOGZjNGZhNjc5MlwvZGI4ZXBiei04NTRiODA3ZS1lMTZjLTQ1MGYtOWRjMS04ODYyYzE3MWU5NjUucG5nIiwid2lkdGgiOiI8PTEwMjQifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.YOf8It7Kps_eqwGMmB0mJHQtI2PthkGS0FKB_-xAWqM",
        "http://4.bp.blogspot.com/-DibV0T2D9MA/Ve7nt94d5BI/AAAAAAAAQrM/_EOdDqMEwSk/s1600/logo-umpghjgj1.jpg",
        "https://i1.wp.com/jejakislam.net/wp-content/uploads/2019/01/800px-Haji_A._Salim.jpg?fit=800%2C1067&ssl=1")

    val listData : ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (item in namaPahlawan.indices){
                val pahlawan = Hero()
                pahlawan.name = namaPahlawan[item]
                pahlawan.country = asalPahlawan[item]
                pahlawan.photo = fotoPahlawan[item]
                pahlawan.biography = biografi[item]
                list.add(pahlawan)
            }
            return list
        }


}