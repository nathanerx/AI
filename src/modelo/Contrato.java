package modelo;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import controlador.ViewCochera;
import controlador.ViewContrato;
import controlador.ViewCuentaCorriente;
import controlador.ViewMedioPago;
import controlador.ViewVehiculo;

public abstract class Contrato
{
	private int						nroContrato;
	private List<Vehiculo>			vehiculo;
	private List<Cochera>			cochera;
	private List<CuentaCorriente>	cuentaCorriente;
	private List<Cobranza>			cobranza;
	private Cliente					cliente;
	private Date					fechaIngreso;
	private Date					fechaSalida;
	private boolean					estado;
	private static int				nroClase;

	public Contrato(Cliente cliente, Date fechaIngreso, Date fechaSalida)
	{
		super();
		this.nroContrato = autoNro();
		this.vehiculo = null;
		this.cochera = null;
		this.cuentaCorriente = null;
		this.cobranza = null;
		this.cliente = cliente;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.estado = true;
	}

	public boolean hayQueFacturar()
	{
		return false;
	}

	public boolean estasVencido()
	{
		return false;
	}

	private static int autoNro()
	{
		nroClase = nroClase + 1;
		return (nroClase);

	}

	public ViewVehiculo altaVehiculo(String patente, String marca, String modelo, Date fechaEntrada)
	{
		ViewVehiculo vv = null;
		if (this.sosMiVehiculo(patente) == null)
		{
			Vehiculo v = new Vehiculo(patente, marca, modelo, fechaEntrada);
			vehiculo.add(v);
			vv = v.verVehiculo();
		}
		return vv;
	}

	public void bajaVehiculo(String Patente)
	{
		Vehiculo v = this.sosMiVehiculo(Patente);
		if (v != null)
		{
			v.bajate();
		}
	}

	public Vehiculo sosMiVehiculo(String patente)
	{
		Vehiculo val = null;
		for (Vehiculo v : vehiculo)
		{
			if (v.sosVehiculo(patente))
			{
				val = v;
			}
		}
		return val;
	}

	public ViewCochera asignarmeCochera(Cochera c)
	{
		ViewCochera v = c.verCochera();
		this.setCochera(c);
		return v;
	}

	public Vector<ViewCochera> mostraCochera()
	{
		Vector<ViewCochera> vc = new Vector<ViewCochera>();
		for (Cochera c : cochera)
		{
			vc.add(c.verCochera());
		}
		return vc;
	}

	public boolean esMiCochera(int codigoCochera)
	{
		Boolean res = false;
		for (Cochera ca : this.cochera)
		{
			if (ca.soyCochera(codigoCochera))
			{
				res = true;
			}
		}
		return res;
	}

	public boolean meSuperpongo(Date inicio, Date fin)
	{
		return !(inicio.after(this.getFechaIngreso()) && inicio.before(this.getFechaSalida()))
				|| inicio.equals(this.getFechaIngreso()) || inicio.equals(this.getFechaSalida());
	}

	public ViewCochera asignarmeCocheraDoble(Cochera c1, Cochera c2)
	{
		Doble d = new Doble(c1, c2);
		ViewCochera v = d.verCochera();
		this.setCochera(d);
		return v;
	}

	public abstract ViewMedioPago asignarMedioPago();

	public boolean sosContrato(int nroContrato)
	{
		if (this.getNroContrato() == nroContrato)
			return true;
		return false;
	}

	public boolean esTuCliente(Cliente c)
	{
		return false;
	}

	public ViewContrato mostrate()
	{
		return null;
	}

	public boolean tenesCliente()
	{
		return false;
	}

	public boolean tenesMedioPago()
	{
		return false;
	}

	public boolean autosYCocherasiguales()
	{
		return false;
	}

	public int contarAutos()
	{
		return -1;
	}

	public void crearCuentaCorriente(float importe)
	{
		int numerocuota = 1;
		int cantcuotas = this.calcularCantCuotas();
		float imp = this.calcularImporteCuota(cantcuotas, importe);
		while (numerocuota < cantcuotas)
		{
			CuentaCorriente nc = new CuentaCorriente(numerocuota, imp, (this.fechaIngreso)); // /
																								// GENERAR
																								// FECHA
																								// INGRESO
																								// +
																								// 10
																								// POR
																								// NRO
																								// CUOTA
																								// POR
																								// 30
			this.cuentaCorriente.add(nc);
		}
	}

	public int calcularCantCuotas()
	{
		int cantcuota = (int) (this.getFechaIngreso().getTime() - this.getFechaSalida().getTime());
		return cantcuota;

	}

	public float calcularImporteCuota(int cantCuotas, float importe)
	{
		return (importe / cantCuotas);
	}

	public void bajarme()
	{
		this.setEstado(false);

	}

	public Vector<ViewCuentaCorriente> mostrarCuentaCorriente()
	{
		return null;
	}

	public ViewMedioPago mostramedioPago()
	{
		return null;

	}

	public Vector<ViewVehiculo> mostraVehiculo()
	{
		Vector<ViewVehiculo> vv = new Vector<ViewVehiculo>();
		for (Vehiculo v : vehiculo)
		{
			vv.add(v.verVehiculo());
		}
		return vv;
	}

	public Vector<ViewCochera> mostraCohera()
	{
		return null;
	}

	public int getNroContrato()
	{
		return nroContrato;
	}

	public void setNroContrato(int nroContrato)
	{
		this.nroContrato = nroContrato;
	}

	public List<Vehiculo> getVehiculo()
	{
		return vehiculo;
	}

	public void setVehiculo(List<Vehiculo> vehiculo)
	{
		this.vehiculo = vehiculo;
	}

	private void setCochera(Cochera cochera)
	{
		this.cochera.add(cochera);
	}

	public List<CuentaCorriente> getCuentaCorriente()
	{
		return cuentaCorriente;
	}

	private List<Cochera> getCochera()
	{
		return cochera;
	}

	public void setCuentaCorriente(List<CuentaCorriente> cuentaCorriente)
	{
		this.cuentaCorriente = cuentaCorriente;
	}

	public List<Cobranza> getCobranza()
	{
		return cobranza;
	}

	public void setCobranza(List<Cobranza> cobranza)
	{
		this.cobranza = cobranza;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}

	public Date getFechaIngreso()
	{
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso)
	{
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaSalida()
	{
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida)
	{
		this.fechaSalida = fechaSalida;
	}

	public boolean isEstado()
	{
		return estado;
	}

	public void setEstado(boolean estado)
	{
		this.estado = estado;
	}

	public int cantDias()
	{
		return 0;
	}
}
