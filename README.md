<h1>TaxCalculatorUsingSocket</h1>
<h2>Overview</h2>
<p>TaxCalculatorUsingSocket is a Java-based project developed as part of an Operating Systems course. It demonstrates the use of socket programming through a simple client-server 
interaction. The server reads citizen data from a file, creates a Citizen object, and sends it to the client. The client calculates the income tax based on the citizen's age and sends 
the tax back to the server. The server then prints the received tax and closes the connection.</p>

<h2>Project Structure</h2>
<ul>
  <li><strong>Server</strong>: Listens for client connections, reads data from a file, creates a Citizen object, sends it to the client, receives the tax, and prints it.</li>
  <li><strong>Client</strong>: Connects to the server, receives the Citizen object, calculates the income tax based on age, sends the tax back to the server, and closes the connection.</li>
  <li><strong>Citizen</strong>: class representing a citizen with attributes such as ID, passport number, name, father's name, date of birth, username, password, and type.</li>
</ul>

<h2>Class Descriptions</h2>
<h3>Server</h3>
<p>The <code>Server</code> class performs the following tasks:</p>
<ol>
  <li>Starts the server and waits for a client connection.</li>
  <li>Reads citizen data from a file named <code>File.txt</code>.</li>
  <li>Creates a <code>Citizen</code> object from the file data.</li>
  <li>Sends the <code>Citizen</code> object to the connected client.</li>
  <li>Receives the calculated income tax from the client.</li>
  <li>Prints the received tax and closes the connection.</li>
</ol>

<h3>Client</h3>
<p>The <code>Client</code> class performs the following tasks:</p>
<ol>
  <li>Connects to the server.</li>
  <li>Receives the <code>Citizen</code> object from the server.</li>
  <li>Calculates the income tax based on the citizen's age.</li>
  <li>Sends the calculated tax back to the server.</li>
  <li>Closes the connection.</li>
</ol>

<h3>Citizen</h3>
<p>The <code>Citizen</code> cclass with the following attributes:</p>
<ul>
  <li><code>id</code>: The citizen's ID.</li>
  <li><code>passportNo</code>: The citizen's passport number.</li>
  <li><code>name</code>: The citizen's name.</li>
  <li><code>fatherName</code>: The citizen's father's name.</li>
  <li><code>dob</code>: The citizen's date of birth.</li>
  <li><code>username</code>: The citizen's username.</li>
  <li><code>password</code>: The citizen's password.</li>
  <li><code>type</code>: The type of citizen.</li>
  <li><code>incomeTaxPercentage</code>: The calculated income tax percentage based on age.</li>
</ul>

<h2>Usage</h2>
<p>To run the project, follow these steps:</p>
<ol>
  <li>Compile the <code>Server</code>, <code>Client</code>, and <code>Citizen</code> classes.</li>
  <li>Run the <code>Server</code> class first to start the server.</li>
  <li>Run the <code>Client</code> class to connect to the server and perform the tasks described above.</li>
</ol>

<h2>Files</h2>
<ul>
  <li><code>Server.js</code>: Contains the server-side code.</li>
  <li><code>Client.js</code>: Contains the client-side code.</li>
  <li><code>Citizen.js</code>: Contains the <code>Citizen</code> class definition.</li>
  <li><code>File.txt</code>: Contains the citizen data read by the server.</li>
</ul>
