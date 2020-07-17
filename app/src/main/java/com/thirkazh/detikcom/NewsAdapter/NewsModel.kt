package com.thirkazh.detikcom.NewsAdapter

import com.thirkazh.detikcom.R

data class news(var title: String, var desc: String, var photo: Int)

object NewsModel {
    val newslist = listOf<news>(
        news("Pasar  ramai dikunjungi warga meskipun wabah covid 19 belum dinyatakan usai",
            "detikcom | 1  jam yang lalu",
        R.drawable.img_news1),

        news("Kapal nelayan menyalurkan bansos masyarakat Sulawesi" ,
            "detikcom | 1 jam yang lalu",
        R.drawable.img_news2),

        news("Macet mulai terjadi di wilayah jalur pemudik Semarang" ,
            "detikcom | 2 jam yang lalu",
        R.drawable.img_news3),

        news("Jelang new normal Jakarta macet lagi" ,
            "detikcom | 3 jam yang lalu",
        R.drawable.img_news4),

        news("Dukung Indonesia perangi covid 19, sampoerna donasi ventilator dan APD full set",
            "detikcom | 4 jam yang lalu" ,
        R.drawable.img_news5),

        news("Saat Risma jelaskan soal penanganan corona kepada BNPB dan Menkes",
            "detikcom | 5 jam yang lalu",
        R.drawable.img_news6),

        news("Banjir keritik ke trump yang kerahkan militer usai demo George floyd",
            "detikcom | 6 jam yang lalu",
        R.drawable.img_news7),

        news("Mengapa aksi demo damai George flyod bisa berubah jadi kerusuhan?" ,
            "detikcom | 8 jam  yang lalu",
        R.drawable.img_news8),

        news("2 opsi bagi jemaah haji yang tidak jadi berangkat tahun ini",
            "detikcom | 1 menit yang lalu",
        R.drawable.img_news9)

    )
}