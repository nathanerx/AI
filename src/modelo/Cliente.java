package modelo;

import java.util.Date;
import java.util.List;

import controlador.ViewCliente;

public class Cliente
{
	private int				dni;
	private String			nombre;
	private String			domicilio;
	private String			telefono;
	private String			mail;
	private boolean			estado;
	private List<Vehiculo>	vehiculo;

	public Cliente(int dni, String nombre, String domicilio, String telefono, String mail)
	{
		this.dni = dni;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.mail = mail;
		this.estado = true;
		// TODO Falta la persistencia
	}

	public void bajarme()
	{
		this.estado = false;
	}

	public void editarme(String nombre, String domicilio, String telefono, String mail)
	{
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.mail = mail;

		// LLAMAR A UPDATE DE CLIENTE
	}

	public void agregarAuto(String patente, String marca, String modelo, Date fechaEntrada)
	{
		Vehiculo v = new Vehiculo(patente, marca, modelo, fechaEntrada);
		vehiculo.add(v);
	}

	public boolean sosCliente(int dni)
	{
		if (this.getDni() == dni)
		{
			return true;
		}
		return false;

	}

	public ViewCliente verCliente()
	{
		return new ViewCliente(this.dni, this.nombre, this.domicilio, this.telefono, this.mail,
				this.estado);
	}

	public boolean tePareces(String clave)
	{
		return (nombre.contains(clave) || domicilio.contains(clave) || domicilio.contains(clave)) ? true
				: false;
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

	public boolean isEstado()
	{
		return estado;
	}

	public void setEstado(boolean estado)
	{
		this.estado = estado;
	}

}
