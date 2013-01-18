public class ProjPresets implements Cloneable
{
  
	public String projtype;
	public byte projstrength;
	public Location projloc;
	public Vector projdir;
	
	public ProjPresets(Presets other)
	{
		if(other != null)
		{			
			projtype = other.projtype;
			projstrength = other.projstrength;
			projloc = other.projloc;
			projdir = other.projdir;
		}
	}
}
