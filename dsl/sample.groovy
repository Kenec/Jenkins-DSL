job('Simple Python Job') {
    description("Simple Python DSL Job. Date: ${new Date()}")
    scm {
        github('beerkeeper/python-ip-script')
    }
    steps {
        virtualenv {
            name('venv')
            command('pip install -r requirements.txt')
            clear()
        }
        virtualenv {
            name('venv')
            command('python main.py')
        }
    }
}