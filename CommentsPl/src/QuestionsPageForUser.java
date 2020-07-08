import com.intellij.openapi.options.SearchableConfigurable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.JComponent;
/*панель в настройках IDE*/

public class QuestionsPageForUser implements SearchableConfigurable {

        private QuestionPanel myTokenSettingsPanel;

        @NotNull
        @Override
        public String getId() {
            return "comment";
        }

        @Nls(capitalization = Nls.Capitalization.Title)
        @Override
        public String getDisplayName() {
            return "Questions from developers";
        }

        @Nullable
        @Override
        public JComponent createComponent() {
            if (myTokenSettingsPanel == null) {
                myTokenSettingsPanel = new QuestionPanel();
            }
            return myTokenSettingsPanel;
        }

        @Override
        public boolean isModified() {
            return myTokenSettingsPanel.isModified();
        }

        @Override
        public void apply() {
            myTokenSettingsPanel.apply();
        }
    }
