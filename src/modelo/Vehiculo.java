package modelo;

import java.util.Date;

import controlador.ViewVehiculo;

public class Vehiculo
{
	private String	patente;
	private String	marca;
	private String	modelo;
	private Date	fechaEntrada;

	public Vehiculo(String patente, String marca, String modelo, Date fechaEntrada)
	{
		super();
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.fechaEntrada = fechaEntrada;
	}

	public boolean sosVehiculo(String patente)
	{
		return (this.getPatente() == patente);

	}

	public ViewVehiculo verVehiculo()
	{
		return null;

	}

	public void bajate()
	{

	}

	public String getPatente()
	{
		return patente;
	}

	public void setPatente(String patente)
	{
		this.patente = patente;
	}

	public String getMarca()
	{
		return marca;
	}

	public void setMarca(String marca)
	{
		this.marca = marca;
	}

	public String getModelo()
	{
		return modelo;
	}

	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	public Date getFechaEntrada()
	{
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada)
	{
		this.fechaEntrada = fechaEntrada;
	}

}
