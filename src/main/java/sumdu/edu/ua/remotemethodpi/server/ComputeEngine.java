/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumdu.edu.ua.remotemethodpi.server;

import sumdu.edu.ua.remotemethodpi.client.Task;
import sumdu.edu.ua.remotemethodpi.client.ComputeRemote;

/**
 *
 * @author Erlkonig
 */
public class ComputeEngine implements ComputeRemote {
@Override
public <T> T executeTask(Task<T> t) {
return t.execute();
}
}