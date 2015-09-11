package modelo;

import controlador.ViewCochera;

public class Simple extends Cochera
{
	public Simple(int codigo)
	{
		super(codigo);
	}

	public boolean estasDisponible()
	{
		return false;
	}

	public ViewCochera verCochera()
	{
		return null;
	}
}
