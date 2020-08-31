fun main(){
    val nilaiDiAtasKkm = 80
    val nilaiDiBawahKkm = 60
    val nilai : String
    nilai = if (nilaiDiBawahKkm > 60){
        "Selamat Ya"
    }else if (nilaiDiBawahKkm > nilaiDiAtasKkm)
        "Nilai kamu 95, Selamat ya"
    else {
        "nilai kamu 56, silahkan ikut remidial"
    }
    print(nilai)
}