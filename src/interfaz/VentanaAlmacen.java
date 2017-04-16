package interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import Datos.Almacen;
import Datos.DatoTabla;
import Datos.Producto;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

/**
* Esta ventana es la vista de un almacen en especifico
* @author Bernardo
*/
public class VentanaAlmacen extends JFrame {

	private JPanel contentPane;
	private JTable tablaProductos;
	private JLabel titulo;
	
	private JButton botonEditar;
	private JButton botonAgregar;
	private JButton botonSalir;
	private JButton botonEliminar;
	
	
	//Este Main es solo prueba
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayList<Producto> prod = new ArrayList<Producto>();
					prod.add(new Producto(10, "Laptop", "HP", "SJHDJK", 1000, 1000, new Almacen("Sacaba", "KM 10", "444")));
					VentanaAlmacen frame = new VentanaAlmacen(prod, "Almacen Sacaba");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Constructor
	 * 
	 * @param productos son los datos que contendra la tabla
	 * @param txtTitulo el titulo de la ventana
	 */
	public VentanaAlmacen(ArrayList<? extends DatoTabla> productos, String txtTitulo) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		titulo = new JLabel(txtTitulo);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Century Gothic", Font.BOLD, 18));
		titulo.setBounds(10, 11, 654, 30);
		
		contentPane.add(titulo);
		tablaProductos = new JTable();
		tablaProductos.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		tablaProductos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		ModeloTabla modelo = new ModeloTabla(productos);
		tablaProductos.setModel(modelo);
		
		tablaProductos.setBounds(10, 52, 654, 311);
		JScrollPane scrollPane = new JScrollPane(tablaProductos);
		scrollPane.setBounds(10, 52, 654, 348);
		contentPane.add(scrollPane);
		botonEditar = nuevoBoton(10, 411, "Editar Producto");
		botonEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editarProducto();
			}
		});
		contentPane.add(botonEditar);
		botonEliminar = nuevoBoton(170, 411, "Eliminar Producto");
		botonEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				eliminarProducto();
			}
		});
		contentPane.add(botonEliminar);
		botonAgregar = nuevoBoton(330, 411, "Agregar Producto");
		botonAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				agregarProducto();
			}
		});
		contentPane.add(botonAgregar);
		botonSalir = nuevoBoton(516, 411, "Salir");
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salir();
			}
		});
		contentPane.add(botonSalir);
	}
	
	private JButton nuevoBoton(int x, int y, String txt){
		JButton boton = new JButton(txt);
		boton.setBackground(new Color(245, 245, 245));
		boton.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		boton.setBounds(x, y, 150, 30);
		return boton;
	}
	
	private void agregarProducto(){
		
	}
	
	private void eliminarProducto(){
		
	}
	
	private void salir(){
		
	}
	
	private void editarProducto(){
		
	}
}
