package com.performance.module_0_119

class Feature119UseCase2(
    private val repository: Feature119Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
