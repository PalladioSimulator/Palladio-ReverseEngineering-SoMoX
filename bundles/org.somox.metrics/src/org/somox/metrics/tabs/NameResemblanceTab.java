package org.somox.metrics.tabs;

import java.util.StringTokenizer;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;

public class NameResemblanceTab extends MetricTab {

    protected Composite control;
    private Text suffixText;
    private Text prefixText;
    private List prefixList;
    private List suffixList;
    private final String DELIMITER = "§";

    public static final String NAME_RESEMBLANCE_CONFIGURATION_EXCLUDED_SUFFIXES = "org.somox.metrics.nameResemblance.excludedSuffixes";
    public static final String NAME_RESEMBLANCE_CONFIGURATION_EXCLUDED_PREFIXES = "org.somox.metrics.nameResemblance.excludedPrefixes";

    @Override
    public void activated(final ILaunchConfigurationWorkingCopy workingCopy) {

    }

    @Override
    public boolean canSave() {
        return true;
    }

    /**
     * @wbp.parser.entryPoint
     */
    @Override
    public void createControl(final Composite parent) {
        control = new Composite(parent, SWT.BORDER);
        control.setLayout(new FillLayout(SWT.HORIZONTAL));
        {
            final Group grpPrefixes = new Group(control, SWT.BORDER);
            grpPrefixes.setLayout(new FillLayout(SWT.VERTICAL));
            grpPrefixes.setText("Prefixes");
            {
                final Composite composite = new Composite(grpPrefixes, SWT.NONE);
                {
                    prefixList = new List(composite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
                    prefixList.setBounds(0, 0, 314, 205);
                }
            }
            {
                final Composite composite = new Composite(grpPrefixes, SWT.NONE);
                final GridLayout gridLayout = new GridLayout(2, false);
                gridLayout.verticalSpacing = 3;
                composite.setLayout(gridLayout);
                new Label(composite, SWT.NONE);
                {
                    final Button prefixRemoveButton = new Button(composite, SWT.NONE);
                    prefixRemoveButton.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseDown(final MouseEvent e) {
                            prefixList.remove(prefixList.getFocusIndex());
                            NameResemblanceTab.this.setDirty(true);
                            NameResemblanceTab.this.updateLaunchConfigurationDialog();
                        }
                    });
                    prefixRemoveButton.setText("Remove selected");
                }
                {
                    prefixText = new Text(composite, SWT.BORDER);
                    prefixText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
                }
                {
                    final Button prefixAddButton = new Button(composite, SWT.NONE);
                    prefixAddButton.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseDown(final MouseEvent e) {
                            final String text = prefixText.getText();
                            if ((text != null) && !"".equals(text)) {
                                prefixList.add(text);
                                NameResemblanceTab.this.setDirty(true);
                                NameResemblanceTab.this.updateLaunchConfigurationDialog();
                            }
                            prefixText.setText("");
                        }
                    });
                    prefixAddButton.setText("Add prefix");
                }
            }
        }
        {
            final Group grpSuffixes = new Group(control, SWT.BORDER);
            grpSuffixes.setLayout(new FillLayout(SWT.VERTICAL));
            grpSuffixes.setText("Suffixes");
            {
                final Composite composite = new Composite(grpSuffixes, SWT.NONE);
                {
                    suffixList = new List(composite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
                    suffixList.setBounds(0, 0, 314, 205);
                }
            }
            {
                final Composite composite = new Composite(grpSuffixes, SWT.NONE);
                final GridLayout gridLayout = new GridLayout(2, false);
                gridLayout.verticalSpacing = 3;
                composite.setLayout(gridLayout);
                new Label(composite, SWT.NONE);
                {
                    final Button suffixRemoveButton = new Button(composite, SWT.NONE);
                    suffixRemoveButton.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseDown(final MouseEvent e) {
                            suffixList.remove(suffixList.getFocusIndex());
                            NameResemblanceTab.this.setDirty(true);
                            NameResemblanceTab.this.updateLaunchConfigurationDialog();
                        }
                    });
                    suffixRemoveButton.setText("Remove selected");
                }
                {
                    suffixText = new Text(composite, SWT.BORDER);
                    suffixText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
                }
                {
                    final Button suffixAddButton = new Button(composite, SWT.NONE);
                    suffixAddButton.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseDown(final MouseEvent e) {
                            final String text = suffixText.getText();
                            if ((text != null) && !"".equals(text)) {
                                suffixList.add(text);
                                NameResemblanceTab.this.setDirty(true);
                                NameResemblanceTab.this.updateLaunchConfigurationDialog();
                            }
                            suffixText.setText("");
                        }
                    });
                    suffixAddButton.setText("Add suffix");
                }
            }
        }
    }

    @Override
    public void deactivated(final ILaunchConfigurationWorkingCopy workingCopy) {

    }

    @Override
    public void dispose() {
    }

    @Override
    public Control getControl() {
        return control;
    }

    @Override
    public String getErrorMessage() {
        return null;
    }

    @Override
    public Image getImage() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public String getName() {
        return "NameResemblance";
    }

    @Override
    public void initializeFrom(final ILaunchConfiguration configuration) {
        try {
            final String suffixString = configuration.getAttribute(NAME_RESEMBLANCE_CONFIGURATION_EXCLUDED_SUFFIXES,
                    "");
            final String prefixString = configuration.getAttribute(NAME_RESEMBLANCE_CONFIGURATION_EXCLUDED_PREFIXES,
                    "");

            StringTokenizer tokenizer = new StringTokenizer(suffixString, DELIMITER);
            int tokenCount = tokenizer.countTokens();
            final String[] suffixes = new String[tokenCount];
            for (int i = 0; i < tokenCount; i++) {
                suffixes[i] = (tokenizer.nextToken());
            }

            tokenizer = new StringTokenizer(prefixString, DELIMITER);
            tokenCount = tokenizer.countTokens();
            final String[] prefixes = new String[tokenCount];
            for (int i = 0; i < tokenCount; i++) {
                prefixes[i] = (tokenizer.nextToken());
            }

            prefixList.setItems(prefixes);
            suffixList.setItems(suffixes);
        } catch (final CoreException e) {

        }
    }

    @Override
    public boolean isValid(final ILaunchConfiguration launchConfig) {
        return true;
    }

    @Override
    public void launched(final ILaunch launch) {

    }

    @Override
    public void performApply(final ILaunchConfigurationWorkingCopy configuration) {
        final String[] prefixes = prefixList.getItems();
        final String[] suffixes = suffixList.getItems();

        StringBuilder buffer = new StringBuilder();
        for (final String prefixe : prefixes) {
            buffer.append(prefixe);
            buffer.append(DELIMITER);
        }
        configuration.setAttribute(NAME_RESEMBLANCE_CONFIGURATION_EXCLUDED_PREFIXES, buffer.toString());

        buffer = new StringBuilder();
        for (final String suffixe : suffixes) {
            buffer.append(suffixe);
            buffer.append(DELIMITER);
        }
        configuration.setAttribute(NAME_RESEMBLANCE_CONFIGURATION_EXCLUDED_SUFFIXES, buffer.toString());
    }

    @Override
    public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
    }
}
