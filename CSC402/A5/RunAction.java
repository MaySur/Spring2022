package p.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.Stream;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTRequestor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * Our sample action implements workbench action delegate. The action proxy will
 * be created by the workbench and shown in the UI. When the user tries to use
 * the action, this delegate will be created and execution will be delegated to
 * it.
 * 
 * @see IWorkbenchWindowActionDelegate
 */
public class RunAction implements IWorkbenchWindowActionDelegate {
	private IWorkbenchWindow window;

	/**
	 * The constructor.
	 */
	public RunAction() {
	}

	/**
	 * The action has been activated. The argument of the method represents the
	 * 'real' action sitting in the workbench UI.
	 * 
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	@Override
	public void run(IAction action) {

		IWorkspace iWorkspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot iWorkspaceRoot = iWorkspace.getRoot();
		IProject[] iProjectList = iWorkspaceRoot.getProjects();
		for(IProject iProject : iProjectList) {			
			List<ICompilationUnit> iCUs = new ArrayList<ICompilationUnit>();
			IJavaProject iJavaProject = JavaCore.create(iProject);
	
			try {
				IPackageFragment[] iPackageFragmentList = iJavaProject.getPackageFragments();
				for (IPackageFragment iPackageFragment : iPackageFragmentList) {
					if (iPackageFragment.getKind() != IPackageFragmentRoot.K_SOURCE) {
						continue;
					}
	
					ICompilationUnit[] iCompilationUnitList = iPackageFragment.getCompilationUnits();
					for (ICompilationUnit iCompilationUnit : iCompilationUnitList) {
						iCUs.add(iCompilationUnit);
					}
				}
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
	
			ICompilationUnit[] compUnits = iCUs.toArray(new ICompilationUnit[0]);
			final Map<ICompilationUnit, ASTNode> parsedCompilationUnits = new HashMap<ICompilationUnit, ASTNode>();
			ASTParser parser = ASTParser.newParser(AST.JLS3);
			parser.setResolveBindings(true);
			parser.setEnvironment(null, null, null, true);
			parser.setProject(iJavaProject);
			parser.createASTs(compUnits, new String[0], new ASTRequestor() {
				@Override
				public final void acceptAST(final ICompilationUnit unit, final CompilationUnit node) {
					parsedCompilationUnits.put(unit, node);
				}
	
				@Override
				public final void acceptBinding(final String key, final IBinding binding) {
					// Do nothing
				}
			}, null);
	
			Iterator<ICompilationUnit> keySetIterator = parsedCompilationUnits.keySet().iterator();
			while (keySetIterator.hasNext()) {
				ICompilationUnit iCU = keySetIterator.next();
				CompilationUnit cu = (CompilationUnit) parsedCompilationUnits.get(iCU);
	
				/**
				 * Assignment #5
				 * 
				 * On my honor,Mayur Suresh, this assignment is my own work.  
				 * I,Mayur Suresh, will follow the instructor's rules and processes 
				 * related to academic integrity as directed in the course syllabus.
				 *
				 */
				
				//---------------------------------------------------------------------
				//
				//  Students -- you are allowed to write your own code from this point
				
				
				ASTVisitorEx visitor = new ASTVisitorEx(); cu.accept(visitor);
				files.put(visitor.getVName(),visitor.getSName());
			}
				
			List<Entry<String, String>> one = (List<Entry<String, String>>) getExtending("Object");

			for(Object interval: one) {				
				System.out.println(((Entry<String,String>) interval).getKey());

				List<Entry<String, String>> x = (List<Entry<String, String>>) getExtending(((Entry<String,String>) interval).getKey());
				StringBuilder sb = new StringBuilder();
				if(x.isEmpty()) {
					System.out.print("#");
				}
				else {
					for (Object i: x) sb.append(((Entry<String,String>) i).getKey());			
					
					System.out.println(sb);
				}

				traverse(x);
				System.out.println();
			}
			files.clear();
		}
		}
	static Map<String, String> files = new HashMap<>();
	
	static Object getExtending(String key) {
				Object ans = files.entrySet()
						.stream().filter(e -> e.getValue().equals(key)).toList();
				return ans;
			}
		static void traverse(List<Entry<String, String>> x) {
			StringBuilder bs = new StringBuilder();
			List<Entry<String, String>> one = new ArrayList<>();

			for (Object i: x){childclass((Entry<String, String>) i, bs, one);bs.append(" ");		}

			System.out.println(bs);

			if (!one.isEmpty())	traverse(one);
		}
		
		

		static void childclass(Entry<String, String> key, StringBuilder builder, List<Entry<String, String>> one) {	List<Entry<String, String>> data = (List<Entry<String, String>>) getExtending(key.getKey());
			one.addAll(data);

			if (data.isEmpty()) {
				builder.append("#");
			} else {
				for (Object i : data ) {builder.append(((Entry<String, String>) i).getKey());}
			}
		}

		

		
	
	
	
	
	//  Students -- you are NOT allowed to write anything below
	//
	//---------------------------------------------------------------------

	/**
	 * Selection in the workbench has been changed. We can change the state of the
	 * 'real' action here if we want, but this can only happen after the delegate
	 * has been created.
	 * 
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	}

	/**
	 * We can use this method to dispose of any system resources we previously
	 * allocated.
	 * 
	 * @see IWorkbenchWindowActionDelegate#dispose
	 */
	@Override
	public void dispose() {
	}

	/**
	 * We will cache window object in order to be able to provide parent shell for
	 * the message dialog.
	 * 
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	@Override
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
}