package single_responsibility.bad;

public class SearchInPDF
{
    public boolean contains(String file,String data)
    {
        String fileData=getData(file);
        return fileData.contains(data);
    }
    private String getData(String file)
    {
        return "Data";
    }
}