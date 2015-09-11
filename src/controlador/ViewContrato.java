package controlador;

import java.util.Date;

public class ViewContrato
{
	private int			nroContrato;
	private Date		inicio;
	private Date		fin;
	private boolean		estado;
	private ViewCliente	cliente;

	public ViewContrato(int nroContrato, Date inicio, Date fin, boolean estado)
	{

	}

	public void agregarCliente(ViewCliente c)
	{

	}

	public int getNroContrato()
	{
		return nroContrato;
	}

	public void setNroContrato(int nroContrato)
	{
		this.nroContrato = nroContrato;
	}

	public Date getInicio()
	{
		return inicio;
	}

	public void setInicio(Date inicio)
	{
		this.inicio = inicio;
	}

	public Date getFin()
	{
		return fin;
	}

	public void setFin(Date fin)
	{
		this.fin = fin;
	}

	public boolean isEstado()
	{
		return estado;
	}

	public void setEstado(boolean estado)
	{
		this.estado = estado;
	}

	public ViewCliente getCliente()
	{
		return cliente;
	}

	public void setCliente(ViewCliente cliente)
	{
		this.cliente = cliente;
	}

}
