package modelo;

import java.util.List;

import controlador.ViewCochera;

public class Doble extends Cochera
{
	private List<Cochera>	cochera;

	public Doble(Cochera c1, Cochera c2)
	{
		/* CREA EL NUEVO NUMERO DE COCHERA CON AMBOS CODIGOS */
		super(c1.getCodigo() + 100);
		this.cochera.add(c1);
		this.cochera.add(c1);
	}

	/*
	 * public boolean estasDisponible() { return false; }ESTO SE DEJA DE USAR
	 * CON LO DE CONTRATOS
	 */

	public ViewCochera verCochera()
	{
		return null;
	}

	public List<Cochera> getCochera()
	{
		return cochera;
	}

	public void setCochera(List<Cochera> cochera)
	{
		this.cochera = cochera;
	}

}
