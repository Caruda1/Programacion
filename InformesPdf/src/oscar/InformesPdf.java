package oscar;

import java.io.FileNotFoundException;

import com.itextpdf.io.IOException;
import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;

public class InformesPdf {
	
	public static void main(String[]args) throws IOException {
		
		InformesPdf i = new InformesPdf();
		i.CreaPdf("C:\\Users\\daw2208\\Documents\\midocumento.pdf");
	}
		public void CreaPdf(String dest) throws IOException{
			PdfWriter writer = null;
			try {
				writer = new PdfWriter(dest);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				writer = new PdfWriter(dest);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			PdfDocument pdf = new PdfDocument(writer);
			
			Document document = new Document(pdf);
		
			PdfFont font = null;
			try {
				font = PdfFontFactory.createFont(StandardFonts.TIMES_ROMAN);
			} catch (java.io.IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			document.add(new Paragraph("iText is:").setFont(font));
			
			List list = new List()
				.setSymbolIndent(12)
				.setListSymbol("\u2022")
				.setFont(font);
			
			list.add(new ListItem("never gonna give you up"))
				.add(new ListItem("never gonna let you down"))
				.add(new ListItem("never gonna run around and desert you"))
				.add(new ListItem("never gonna make you cry"))
				.add(new ListItem("never gonna say doodbye"))
				.add(new ListItem("never gonna tell a lie and hurt you"));
			
			document.add(list);
			
			document.close();
		}
		
		
	}


