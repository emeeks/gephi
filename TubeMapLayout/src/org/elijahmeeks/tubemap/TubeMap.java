/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.elijahmeeks.tubemap;

import javax.swing.Icon;
import javax.swing.JPanel;
import org.gephi.layout.spi.Layout;
import org.gephi.layout.spi.LayoutBuilder;
import org.gephi.layout.spi.LayoutUI;
import org.openide.util.NbBundle;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author elijahmeeks
 */
    @ServiceProvider(service=LayoutBuilder.class)
public class TubeMap implements LayoutBuilder {

    private TubeMapLayoutUI ui = new TubeMapLayoutUI();

    public String getName() {
        return NbBundle.getMessage(TubeMap.class, "TubeMap.name");
    }

    public Layout buildLayout() {
        return new TubeMapLayout(this, 50);
    }

    public LayoutUI getUI() {
        return ui;
    }

    private static class TubeMapLayoutUI implements LayoutUI {

        public String getDescription() {
            return NbBundle.getMessage(TubeMap.class, "TubeMap.description");
        }

        public Icon getIcon() {
            return null;
        }

        public JPanel getSimplePanel(Layout layout) {
            return null;
        }

        public int getQualityRank() {
            return -1;
        }

        public int getSpeedRank() {
            return -1;
        }
    }
}
