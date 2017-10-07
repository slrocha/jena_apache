package jena;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.util.FileManager;
import org.apache.jena.vocabulary.VCARD;



/** Tutorial 7 - selecting the VCARD resources
 */
public class Main extends Object {
    
	static	String	personURI =	"http://somewhere/JohnSmith";	
	static	String	fullName =	"John	Smith";	
	
	public	static	void	main(String[]	args)		
	{	
//		 	//	create	an	empty	Model	
//		 	Model	model	=	ModelFactory.createDefaultModel();
//		 	//	create	the	resource	
//		 	Resource	johnSmith	=	model.createResource(personURI);
//		 	//	add	the	property	
//		 	johnSmith.addProperty(VCARD.FN,	fullName);
//		 	model.write(System.out,	"Turtle");
		
		EnderecoCrud cc = new EnderecoCrud();
		cc.listar();
		System.out.println("--------\nSem Classificação \n--------");
		for (Endereco c : cc.enderecos) { //de onde vem **clientes** ? É o List da classe ClienteCrud ?
			System.out.println(c.getBairro());
			System.out.println(c.getCidade());
			System.out.println(c.getRua());
			System.out.println(c.getNumero());

		}
	}  
}