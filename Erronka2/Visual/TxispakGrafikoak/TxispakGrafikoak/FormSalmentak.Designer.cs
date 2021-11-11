
namespace TxispakGrafikoak
{
    partial class FormSalmentak
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.label3 = new System.Windows.Forms.Label();
            this.salmentakTableAdapter = new TxispakGrafikoak.TxispakDataSetTableAdapters.SalmentakTableAdapter();
            this.txispakDataSet = new TxispakGrafikoak.TxispakDataSet();
            this.salmentakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.kontrola1 = new SalmentakTaulaDLL.Kontrola();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.salmentakBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.Image = global::TxispakGrafikoak.Properties.Resources.close;
            this.button1.Location = new System.Drawing.Point(996, 12);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(32, 32);
            this.button1.TabIndex = 14;
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(34, 511);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(75, 23);
            this.button2.TabIndex = 15;
            this.button2.Text = "BACK";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.pictureBox1);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox1.ForeColor = System.Drawing.Color.White;
            this.groupBox1.Location = new System.Drawing.Point(34, 27);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(200, 100);
            this.groupBox1.TabIndex = 16;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "IRABAZIAK";
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::TxispakGrafikoak.Properties.Resources.Captura_de_pantalla_2021_11_09_114151;
            this.pictureBox1.Location = new System.Drawing.Point(17, 32);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(58, 49);
            this.pictureBox1.TabIndex = 3;
            this.pictureBox1.TabStop = false;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(108, 50);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(0, 20);
            this.label3.TabIndex = 1;
            // 
            // salmentakTableAdapter
            // 
            this.salmentakTableAdapter.ClearBeforeFill = true;
            // 
            // txispakDataSet
            // 
            this.txispakDataSet.DataSetName = "TxispakDataSet";
            this.txispakDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // salmentakBindingSource
            // 
            this.salmentakBindingSource.DataMember = "Salmentak";
            this.salmentakBindingSource.DataSource = this.txispakDataSet;
            // 
            // kontrola1
            // 
            this.kontrola1.Location = new System.Drawing.Point(286, 134);
            this.kontrola1.Name = "kontrola1";
            this.kontrola1.Size = new System.Drawing.Size(564, 332);
            this.kontrola1.TabIndex = 17;
            // 
            // FormSalmentak
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ControlDarkDark;
            this.ClientSize = new System.Drawing.Size(1040, 546);
            this.Controls.Add(this.kontrola1);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "FormSalmentak";
            this.Text = "FormSalmentak";
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.salmentakBindingSource)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.PictureBox pictureBox1;
        private SalmentakTaulaDLL.Kontrola kontrola1;
        private TxispakDataSetTableAdapters.SalmentakTableAdapter salmentakTableAdapter;
        private TxispakDataSet txispakDataSet;
        private System.Windows.Forms.BindingSource salmentakBindingSource;
    }
}