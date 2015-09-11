package modelo;

import controlador.ViewCochera;

public abstract class Cochera
{
	private int	codigo;

	public Cochera(int codigo)
	{
		super();
		this.codigo = codigo;
	}

	// public boolean estasDisponible(){
	// return true;
	// }

	public abstract ViewCochera verCochera();

	public boolean soyCochera(int codigoCochera)
	{
		return (this.getCodigo() == codigoCochera);
	}

	public int getCodigo()
	{
		return codigo;
	}

	public void setCodigo(int codigo)
	{
		this.codigo = codigo;
	}

	private int getCodigoVecina()
	{
		return this.getCodigo() + 1;
	}

}
