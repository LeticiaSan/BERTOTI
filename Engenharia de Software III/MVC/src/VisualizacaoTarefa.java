import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;

public class VisualizacaoTarefa extends JFrame implements ObservadorTarefa {
    private JTree arvoreTarefas;
    private DefaultMutableTreeNode raiz;
    private DefaultTreeModel modeloArvore;

    public VisualizacaoTarefa() {
        setTitle("Lista de Tarefas");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        raiz = new DefaultMutableTreeNode("Tarefas");
        modeloArvore = new DefaultTreeModel(raiz);
        arvoreTarefas = new JTree(modeloArvore);

        JScrollPane painelRolagem = new JScrollPane(arvoreTarefas);
        add(painelRolagem, BorderLayout.CENTER);
    }

    public void atualizarListaTarefas(String[] tarefas) {
        raiz.removeAllChildren();

        for (String tarefa : tarefas) {
            DefaultMutableTreeNode noTarefa = new DefaultMutableTreeNode(tarefa);
            raiz.add(noTarefa);
        }

        modeloArvore.reload();
    }
}