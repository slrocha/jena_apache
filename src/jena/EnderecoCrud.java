package jena;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EnderecoCrud {

	public List<Endereco> enderecos = new ArrayList<Endereco>();

	public void listar(){
		ResultSet rs = null;
		Connection cnn = ConnectionFactory.getConnection();
		
		try{
			PreparedStatement sql = cnn.prepareStatement("select * from enderecos limit 15");
			rs = sql.executeQuery();
			while(rs.next()){
				Endereco endereco = new Endereco();
			    endereco.setBairro(rs.getString("bairro"));
			    endereco.setCidade(rs.getString("cidade"));
			    endereco.setRua(rs.getString("rua"));
			    endereco.setNumero(rs.getInt("numero"));

			    enderecos.add(endereco);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
}
