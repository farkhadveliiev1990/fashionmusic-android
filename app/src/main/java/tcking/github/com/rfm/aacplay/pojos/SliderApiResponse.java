
package tcking.github.com.rfm.aacplay.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SliderApiResponse {

    @SerializedName("Titlu")
    @Expose
    private String titlu;
    @SerializedName("Link")
    @Expose
    private String link;
    @SerializedName("Poza")
    @Expose
    private String poza;
    @SerializedName("CMSdate")
    @Expose
    private String cMSdate;

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPoza() {
        return poza;
    }

    public void setPoza(String poza) {
        this.poza = poza;
    }

    public String getCMSdate() {
        return cMSdate;
    }

    public void setCMSdate(String cMSdate) {
        this.cMSdate = cMSdate;
    }

}
