/**
 * 
 */
package br.com.easygame.servico;

import java.io.StringReader;
import java.util.List;

import javax.inject.Named;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.easygame.conexao.ProducerEntityManager;
import br.com.easygame.dao.JogadorDAO;
import br.com.easygame.entity.Jogador;

/**
 * @author Alexandre
 *
 */
@Named
@Path(value = "jogador")
public class JogadorService {

	public JogadorService() {
	}
	
	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	public String cadastrarJogador(String json) throws Exception {
//		EntityManager entityManager = null;
//		try {
//			entityManager = ProducerEntityManager.getEntityManager();
//			entityManager.getTransaction().begin();
//			JogadorDAO jogadorDAO = new JogadorDAO(entityManager);
//			JsonReader jsonReader = Json.createReader(new StringReader(json));
//			JsonObject jsonObject = jsonReader.readObject();
//			String nome = jsonObject.getString("nome");
//			String posicao = jsonObject.getString("posicao");
//			String telefone = jsonObject.getString("telefone");
//			String endereco = jsonObject.getString("endereco");
//			if (nome != null && posicao != null) {
//				Jogador jogador = new Jogador();
//				jogador.setNome(nome);
//				jogador.setPosicao(posicao);
//				jogador.setEndereco(endereco);
//				jogador.setTelefone(telefone);
//				jogadorDAO.salvar(jogador);
//				entityManager.getTransaction().commit();
//				return Json.createObjectBuilder()
//						.add("sucesso", jogador.getId().toString()).build().toString();
//			}
//			
//		} catch (Exception e) {
//			e.getCause();
//		} finally {
//			if (entityManager != null) {
//				entityManager.close();
//			}
//		}
//		return Json.createObjectBuilder()
//				.add("erro", "Não salvou o jogador").build().toString();
//	}
//	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public String listarJogadores() {
//		EntityManager entityManager = null;
//		try {
//			entityManager = ProducerEntityManager.getEntityManager();
//			entityManager.getTransaction().begin();
//			//aqui um exemplo de como retornar todos os usuarios com JSON
//			JogadorDAO jogadorDAO = new JogadorDAO(entityManager);
//			List<Jogador> jogadores = jogadorDAO.listar();
//			JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
//			for (Jogador jogador : jogadores) {
//				arrayBuilder.add(Json.createObjectBuilder()
//						.add("id", jogador.getId().toString())
//						.add("nome", jogador.getNome())
//						.add("posicao", jogador.getPosicao()));
//				
//			}
//			return arrayBuilder.build().toString();
//			
//		} catch (Exception e) {
//			e.getCause();
//		} finally {
//			if (entityManager != null) {
//				entityManager.close();
//			}
//		}
//		return "não listou";
//	}

}
