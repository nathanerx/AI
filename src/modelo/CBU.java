package modelo;

import controlador.ViewMedioPago;

public class CBU extends MedioPago
{
	private EntidadBancaria	entidadBancaria;
	private int				cbu;

	public ViewMedioPago mostrate(String detalle)
	{
		return null;

	}

	public void MedioPago(EntidadEmisoraTarjeta entidad, int cbu)
	{

	}

	public ViewMedioPago mostrate()
	{
		return null;
	}

	public void MedioPago()
	{

	}

	public EntidadBancaria getEntidadBancaria()
	{
		return entidadBancaria;
	}

	public void setEntidadBancaria(EntidadBancaria entidadBancaria)
	{
		this.entidadBancaria = entidadBancaria;
	}

	public int getCbu()
	{
		return cbu;
	}

	public void setCbu(int cbu)
	{
		this.cbu = cbu;
	}

}
