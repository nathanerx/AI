package controlador;

import java.util.Date;

public class ViewCuentaCorriente
{
	private int				cuota;
	private float			importe;
	private Date			fechaVencimiento;
	private Date			fechaPago;
	private ViewMedioPago	medioPago;

	public void viewCuentaCorriente(int couota, float importe, Date venc, Date fPago,
			ViewMedioPago mp)
	{

	}

	public int getCuota()
	{
		return cuota;
	}

	public void setCuota(int cuota)
	{
		this.cuota = cuota;
	}

	public float getImporte()
	{
		return importe;
	}

	public void setImporte(float importe)
	{
		this.importe = importe;
	}

	public Date getFechaVencimiento()
	{
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento)
	{
		this.fechaVencimiento = fechaVencimiento;
	}

	public Date getFechaPago()
	{
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago)
	{
		this.fechaPago = fechaPago;
	}

	public ViewMedioPago getMedioPago()
	{
		return medioPago;
	}

	public void setMedioPago(ViewMedioPago medioPago)
	{
		this.medioPago = medioPago;
	}

}
