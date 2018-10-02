package epcc.acm;

import epcc.acm.oop.ReadFile;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {

        List<epcc.acm.project.oop.Nasdaq> r = new ReadFile().getNasdaq();


    }
}
