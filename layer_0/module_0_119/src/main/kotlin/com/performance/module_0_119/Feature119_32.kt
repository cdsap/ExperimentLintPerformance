package com.performance.module_0_119

class Feature119UseCase0(
    private val repository: Feature119Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
