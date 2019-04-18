package br.com.targettrust.traccadastros.repositorios;



@RunWith(SpringRunner.class)
@SpringBootTest

public class ResevaRepository {

	
	private static final String PLACA_DEFAULT = "IXX-9I99";
	@Autowired
	private LocacaoRepository locacaoRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@Before
	@After
	public void cleanup() {
		locacaoRepository.deleteByVeiculo(PLACA_DEFAULT);
		veiculoRepository.deleteByPlaca(PLACA_DEFAULT);
	}

	@Test
	public void comDuasLocacoesNoMesDeveRetornarDuasNaConsulta(){
		//Arrange
		/*
		// Isto não é um boa prática, estou fazendo a pedidos 
		Funcionario funcionario = new Funcionario();
		funcionario.setLogin("administrador");
		funcionario.setMatricula("12345678");
		funcionario.setNome("Administrador do Sistema");
		funcionario.setSenha("1q2w3e");
		funcionario.setId(usuarioRepository.save(funcionario).getId());
		Cliente cliente = new Cliente();
		cliente.setEndereco("Rua São Franciso da Califórnia, 23");
		cliente.setNome("Thiago Valverde de Souza");
		cliente.setLogin("valverde.thiago");
		cliente.setSenha("target@2019");
		cliente.setId(usuarioRepository.save(cliente).getId());
		Carro carro = new Carro();
		carro.setMarca("Audi");
		carro.setModelo("A5");
		carro.setAno(2019);
		carro.setPlaca(PLACA_DEFAULT);
		carro.setCor("Branca");
		carro.setPortas(4);
		carro.setId(veiculoRepository.save(carro).getId());
		Locacao locacao = new Locacao();
		locacao.setCliente(cliente);
		locacao.setVeiculo(carro);
		locacao.setFuncionario(funcionario);
		Date dataInicial = new Date();
		Date dataFinal = new Date();
		locacao.setDataInicial(dataInicial);
		locacao.setDataFinal(dataFinal);
		locacao.setId(locacaoRepository.save(locacao).getId());
		//Act
		List<Locacao> locacoes = locacaoRepository
				.findByFuncionario(funcionario, dataInicial, dataFinal);
		//Assert TODO
		System.out.println(locacoes);
		*/
}
