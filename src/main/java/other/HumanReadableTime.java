package other;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.SimpleTimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.LongStream;
import java.util.zip.DataFormatException;

public class HumanReadableTime {

    public static void main(String[] args) {

        System.out.println(makeReadable(7201));
    }

   public static String makeReadable(int seconds){
        return String.format("%02d:%02d:%02d",seconds/3600,seconds%3600/60,seconds%60);
   }
}
