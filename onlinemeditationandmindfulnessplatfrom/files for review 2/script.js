document.addEventListener('DOMContentLoaded', (event) => {
    const toggleSwitch = document.getElementById('toggle-switch');
    const body = document.body;

    // Check if dark mode is already set from previous session
    if (localStorage.getItem('darkMode') === 'true') {
        body.classList.add('dark-mode');
        if (toggleSwitch) toggleSwitch.checked = true;
    }

    // Toggle dark mode
    if (toggleSwitch) {
        toggleSwitch.addEventListener('change', () => {
            body.classList.toggle('dark-mode');
            
            // Store the dark mode state in local storage
            if (body.classList.contains('dark-mode')) {
                localStorage.setItem('darkMode', 'true');
            } else {
                localStorage.setItem('darkMode', 'false');
            }
        });
    }
});
