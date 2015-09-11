package modelo;

import controlador.ViewCobranza;

public class Cobranza
{
	private int		cuota;
	private int		monto;
	private Object	fechaPago;

	public ViewCobranza mostrate()
	{
		return null;
	}

	public int getCuota()
	{
		return cuota;
	}

	public void setCuota(int cuota)
	{
		this.cuota = cuota;
	}

	public int getMonto()
	{
		return monto;
	}

	public void setMonto(int monto)
	{
		this.monto = monto;
	}

	public Object getFechaPago()
	{
		return fechaPago;
	}

	public void setFechaPago(Object fechaPago)
	{
		this.fechaPago = fechaPago;
	}

}
