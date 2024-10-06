package com.mycompany.app;
import com.groupdocs.conversion.Converter;
//import com.groupdocs.options.convert.EmailConvertOptions;
import com.groupdocs.conversion.licensing.License;
import com.groupdocs.conversion.options.convert.ConvertOptions;

public class MsgToEmlConverter {

    public static void main(String[] args) throws Exception {

        if (args.length < 2) {
            System.out.println("Usage: MsgToEmlConverter <input_file.msg> <output_file.eml>");
            return;
        }

   String inputFilePath = args[0];
   String outputFilePath = args[1];

Converter converter = new Converter(inputFilePath);

ConvertOptions options = converter.getPossibleConversions("eml")
                .getSource().getConvertOptions();


converter.convert(outputFilePath, options);
  //  EmailConvertOptions options = new EmailConvertOptions();

//    // Set specific options for conversion (if needed)
//    options.setExtractEmbeddedImages(true); // Extract embedded images
//    options.setExtractAttachments(true); // Extract attachments


// Use the options object in the conversion process
//Converter.convert(inputFilePath, outputFilePath, options);
       System.out.println("Converted MSG file to EML successfully!");
    }
}

