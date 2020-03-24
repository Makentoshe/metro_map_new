package m.verycool.metromap


import android.graphics.Typeface
import android.os.Bundle
import android.text.Html
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.info_activity.*


class InfoActivity : AppCompatActivity() {

    private lateinit var nameData: String
    private lateinit var dateData: String
    private lateinit var depthData: String
    private lateinit var architectsData: String
    private lateinit var historyData: String
    private lateinit var images : IntArray

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_activity)

        nameData = intent.getStringExtra("name")
        dateData = intent.getStringExtra("date")
        depthData = intent.getStringExtra("depth")
        architectsData = intent.getStringExtra("architects")
        historyData = intent.getStringExtra("hours")



        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setTitle(nameData)


        val typeface = Typeface.createFromAsset(assets, "font/Roboto-ThinItalic.ttf")
        name.text = Html.fromHtml("<b>Название станции: </b> $nameData")
        date.text = Html.fromHtml("<b>Станция была построена: </b> $dateData")
        depth.text = Html.fromHtml("<b>Глубина станции: </b> $depthData")
        architects.text = Html.fromHtml("<b>Архитекторы: </b> $architectsData")
        history.text = Html.fromHtml("<b>Краткая информация о станции: </b> $historyData")

        name.typeface = typeface
        date.typeface = typeface
        depth.typeface = typeface
        architects.typeface = typeface
        history.typeface = typeface

    }

    //override fun onOptionsItemSelected(item: MenuItem): Boolean {
      //  when (item.itemId) {
        //    android.R.id.home -> {
          //      this.finish()
            //    return true
           // }
           // else -> return super.onOptionsItemSelected(item)
        //}
   // }
}