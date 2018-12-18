public class ComplexTag extends Tag 
{
	private Vector<Tag> tags; 
    // 1.a
public ComplexTag(String tagName)
{ 
  super(tagName); 
     tags = new Vector<Tag>();
   }
    // 1.b
	public String toString() 
{
        String res = "[" + tagName + "]" + "\n";  
        for(Tag t : tags)
 res = res + "\t" + t.toString() + "\n";
       res = res + "[\\" + tagName + "]";
       return res;
    }
   // 1.c
public Tag getTag(String tagName) throws TagNotExistException { 
        for(Tag t : tags) 
{
      if(t.getTagName().equals(tagName))
             return t;
      
   if(t instanceof ComplexTag) {

                try {
        
            Tag res = ((ComplexTag) t).getTag(tagName);
   
                 return res;
        
        }
             
   catch(TagNotExistException e) {}
            }
        }
   
     
        throw new TagNotExistException();   
  
  }
    
   
 // 1.d
	public void addTag(Tag t) 
{ 
    
    tags.add(t);
    
}
    
    
// 1.e
   
 public static ComplexTag load(File f) throws LoadFailException {
 
       BufferedReader in = new BufferedReader(new FileReader(f));

        String line;
        try
 {
          
   line = in.readLine();
        
}
      
  catch(IOException e) 
{
 throw new LoadFailException(); 
}
        
        int i = line.indexOf(']');
        
String tagName = line.substring(1, i);
       
 ComplexTag res = new ComplexTag(tagName);
        
        
int end = line.indexOf(']', i + 1);
       
 while(end != -1)
 {
           
 tagName = line.substring(i+1, end);
          
  i = line.indexOf('[', end + 1);
  
          String data = line.substring(end+1, i);
  
          res.addTag(new SimpleTag(tagName, data);
   
         int end = line.indexOf(']', i + 1);
     
   }
        return res;
      
  }
    }

}


public class TagsActivity implements OnClickListener {
  
  private ComplexTag tags;
    // rest of widgets...
    
 
   public void onClick(View v)
 {
   
     // 1.f
  
      if(v.getId() == R.id.cmdLoad)
 {
   
         if(txtName.getText().equals(""))
       
         Toast.makeText(this, "File is missing", Toast.LENGTH_SHORT).show();
       
     else {
       
         try {
   
                 tags = ComplexTag.load(txtName.getText());
                }
     
           catch(LoadFailException e)
 {
             
       Toast.makeText(this, "Error in loading", Toast.LENGTH_SHORT).show();
                }
            }
        }
        // 1.g
        else if(v.getId() == R.id.cmdAdd) {
            String tagNAme = txtName.getText();
            if(tagName.equals(""))
                Toast.makeText(this, "Missing tag's name", Toast.LENGTH_SHORT).show();
            else {
                tags.addTag(new SimpleTag(tagName, "Test"));
            }
        }
        // 1.h
        else if(v.getId() == R.id.cmdGet) {
            String tagNAme = txtName.getText();
            if(tagName.equals(""))
                Toast.makeText(this, "Missing tag's name", Toast.LENGTH_SHORT).show();
            else {
                try {
                    Tag t = tags.getTag(tagName);
                    Toast.makeText(this, t.toString(), Toast.LENGTH_SHORT).show();
                }
                catch(TagNotExistException e) {
                    Toast.makeText(this, "Tag doesn't exist", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
                           
