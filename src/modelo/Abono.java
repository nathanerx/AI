package modelo;

import controlador.ViewAbono;

public abstract class Abono
{
	private float	monto;
	private int		desde;
	private int		hasta;
	public String	codigo;

	public float calcularImporte(int cantAutos, int dias)
	{
		return 0;
	}

	public boolean aplicas(int dias)
	{
		return false;

	}

	public boolean sosAbono(String codigo)
	{
		return false;
	}

	public ViewAbono mostrate()
	{
		return null;
	}

	public abstract void bajame();

	public abstract void editame();

	public abstract boolean sosEspecial();

	public boolean superpuesto(int desde, int hasta)
	{
		return false;
	}

	public float getMonto()
	{
		return monto;
	}

	public void setMonto(float monto)
	{
		this.monto = monto;
	}

	public int getDesde()
	{
		return desde;
	}

	public void setDesde(int desde)
	{
		this.desde = desde;
	}

	public int getHasta()
	{
		return hasta;
	}

	public void setHasta(int hasta)
	{
		this.hasta = hasta;
	}

	public String getCodigo()
	{
		return codigo;
	}

	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	};

}
