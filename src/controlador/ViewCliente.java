package controlador;

public class ViewCliente
{
	private int		dni;
	private String	nombre;
	private String	domicilio;
	private String	telefono;
	private String	mail;

	public ViewCliente(int dni, String nombre, String domicilio, String Telefono, String mail,
			boolean estado)
	{

	}

	public int getDni()
	{
		return dni;
	}

	public void setDni(int dni)
	{
		this.dni = dni;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getDomicilio()
	{
		return domicilio;
	}

	public void setDomicilio(String domicilio)
	{
		this.domicilio = domicilio;
	}

	public String getTelefono()
	{
		return telefono;
	}

	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}

	public String getMail()
	{
		return mail;
	}

	public void setMail(String mail)
	{
		this.mail = mail;
	}

}
