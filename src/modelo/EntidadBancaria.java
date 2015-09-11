package modelo;

public class EntidadBancaria
{
	private int		nroEntidad;
	private String	Descripcion;

	public void mostrate(int nro, String Desc)
	{

	}

	public boolean sosBanco(Object nroEntidad)
	{
		return false;
	}

	public int getNroEntidad()
	{
		return nroEntidad;
	}

	public void setNroEntidad(int nroEntidad)
	{
		this.nroEntidad = nroEntidad;
	}

	public String getDescripcion()
	{
		return Descripcion;
	}

	public void setDescripcion(String descripcion)
	{
		Descripcion = descripcion;
	}

}
